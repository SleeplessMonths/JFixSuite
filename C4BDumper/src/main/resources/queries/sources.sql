SELECT
    source.id,
    source.submission,
    source.sourceCode,
    languages.name AS language,
    problems.fullname,
    accepted_source.sourceCode AS accepted_sourceCode,
    realfaultslocations.faultlocations,
    realfaultslocations.countfaults
FROM
    source
INNER JOIN
    realfaultslocations ON source.submission = realfaultslocations.subwrong
INNER JOIN
    problems ON source.problems_id = problems.id
INNER JOIN
    languages ON source.languages_id = languages.id
INNER JOIN
    verdicts ON source.verdicts_id = verdicts.id
LEFT JOIN
    source AS accepted_source ON realfaultslocations.subaccepted = accepted_source.submission
WHERE
    source.isduplicated = 0
    AND realfaultslocations.countfaults = 1
    AND languages.name LIKE "Java %"
    AND verdicts.name LIKE 'Wrong answer on test'
    -- filter out all the cases with truncated testdata
    AND NOT EXISTS (
        SELECT
            1
        FROM
            testcases
        WHERE
            testcases.problems_id = source.problems_id
            AND (
                testcases.expectedresult LIKE "%..."
                OR testcases.inputdata LIKE "%..."
            )
    )
    -- filter out all the wrong pairs of submissions
    AND NOT EXISTS (
        SELECT
            1
        FROM
            source AS s2
        INNER JOIN
            languages AS l2 ON s2.languages_id = l2.id
        WHERE
            s2.submission = realfaultslocations.subaccepted
            AND l2.name NOT LIKE "Java %"
    );
