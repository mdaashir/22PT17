create table
    employee (
        employee_id NUMBER not null,
        fname VARCHAR2 (20),
        lname VARCHAR2 (20),
        salary NUMBER (12, 2),
        jdate VARCHAR2 (40),
        depart varchar(20),
        gender VARCHAR2 (10),
        PRIMARY KEY (employee_id)
    );

INSERT ALL INTO employee
VALUES
    (
        1,
        'Vikas',
        'Ahlawat',
        600000,
        '2013-02-15 11:16:28.290',
        'IT',
        'Male'
    ) INTO employee
VALUES
    (
        2,
        'Nikita',
        'Jain',
        530000,
        '2014-01-09 17:31:07.793',
        'HR',
        'F'
    ) INTO employee
VALUES
    (
        3,
        'Ashish',
        'Kumar',
        1000000,
        '2014-01-09 10:05:07.793',
        'IT',
        'Male'
    ) INTO employee
VALUES
    (
        4,
        'Nikhil',
        'Sharma',
        480000,
        '2014-01-09 08:00:07.793',
        'HR',
        'Male'
    ) INTO employee
VALUES
    (
        5,
        'Anish',
        'Kadian',
        500000,
        '2014-01-09 09:31:07.793',
        'Payroll',
        'Male'
    )
SELECT
    1
FROM
    DUAL;

CREATE table
    projdetail (
        proj_id NUMERIC not null,
        employee_id NUMERIC not null,
        proj_name VARCHAR2 (20),
        PRIMARY KEY (proj_id),
        FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
    );

INSERT ALL into projdetail
VALUES
    (1, 1, 'Task Track') into projdetail
VALUES
    (2, 1, 'CLP') into projdetail
VALUES
    (3, 1, 'Survey Management') into projdetail
VALUES
    (4, 2, 'Hr management') into projdetail
VALUES
    (5, 3, 'Task Track') into projdetail
VALUES
    (6, 3, 'GRS') into projdetail
VALUES
    (7, 3, 'DDS') into projdetail
VALUES
    (8, 4, 'Hr management')
SELECT
    1
FROM
    dual;

SELECT
    *
FROM
    employee,
    projdetail
WHERE
    employee.employee_id = projdetail.employee_id;

SELECT DISTINCT
    *
FROM
    employee,
    projdetail
WHERE
    employee.employee_id = projdetail.employee_id;