SELECT
    FirstName,
    ProjectName
FROM
    Emp_id A
    INNER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
ORDER BY
    FirstName;

SELECT
    FirstName,
    ProjectName
FROM
    Emp_id A
    LEFT OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
ORDER BY
    FirstName;

SELECT
    FirstName,
    ISNULL (ProjectName)
FROM
    Emp_id A
    LEFT OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
ORDER BY
    FirstName;

SELECT
    FirstName,
    ProjectName
FROM
    Emp_id A
    RIGHT OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
ORDER BY
    FirstName;

SELECT
    FirstName,
    ProjectName
FROM
    Emp_id A
    FULL OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
ORDER BY
    FirstName;

SELECT
    FirstName,
    ISNULL (ProjectName) AS ProjectName
FROM
    Emp_id A
    LEFT OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
WHERE
    ProjectName IS NULL;

SELECT
    ProjectName
FROM
    Emp_id A
    RIGHT OUTER JOIN Prj_id B ON A.Emp_id = B.Emp_dt_id
WHERE
    FirstName IS NULL;

Select
    Emp_id,
    FirstName,
    ProjectName
FROM
    Emp_id E
    INNER JOIN Prj_id P ON E.Emp_id = P.Emp_dt_id
WHERE
    Emp_id IN (
        SELECT
            Emp_dt_id
        FROM
            Prj_id
        GROUP BY
            Emp_dt_id
        HAVING
            COUNT(*) > 1
    );

SELECT
    ProjectName,
    FirstName
FROM
    Prj_id P
    INNER JOIN Emp_id E ON P.Emp_id = E.Emp_dt_id
WHERE
    P.ProjectName IN (
        SELECT
            ProjectName
        FROM
            Prj_id
        GROUP BY
            ProjectName
        HAVING
            COUNT(1) > 1
    );