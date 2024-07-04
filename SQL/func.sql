CREATE TABLE
    departments (depid INT PRIMARY KEY, name VARCHAR2 (50));

CREATE TABLE
    employees (
        employeeid INT PRIMARY KEY,
        depid int,
        surname varchar2 (40),
        name varchar2 (40),
        bossid int,
        salary number,
        constraint fk FOREIGN KEY (depid) REFERENCES departments (depid)
    );

INSERT INTO
    departments (depid, name)
VALUES
    (1, 'Management');

INSERT INTO
    departments (depid, name)
VALUES
    (2, 'Administration');

INSERT INTO
    departments (depid, name)
VALUES
    (3, 'Technological');

INSERT INTO
    departments (depid, name)
VALUES
    (4, 'Busniess');

INSERT INTO
    departments (depid, name)
VALUES
    (5, 'Support');

INSERT INTO
    employee
VALUES
    (1, 1, 'Smith', 'Jacob', NULL, 23000);

INSERT INTO
    employee
VALUES
    (2, 2, 'Johnson', 'Ethan', 1, 5300);

INSERT INTO
    employee
VALUES
    (3, 3, 'Williams', 'Isabella', 1, 4500);

INSERT INTO
    employee
VALUES
    (5, 3, 'Brown', 'Joshua', 2, 4300);

INSERT INTO
    employee
VALUES
    (4, 2, 'Jones', 'Alexnder', 2, 6900);

INSERT INTO
    employee
VALUES
    (6, 4, 'Davis', 'Jan', 3, 6590);

INSERT INTO
    employee
VALUES
    (7, 5, 'Smith', 'Madison', 4, 4560);

INSERT INTO
    employee
VALUES
    (8, 5, 'Williams', 'Joshua', 3, 3300);

INSERT INTO
    employee
VALUES
    (9, 1, 'Nowicki', 'William', 4, 13800);

INSERT INTO
    employee
VALUES
    (10, 2, 'Miller', 'Emma', 1, 16000);

INSERT INTO
    employee
VALUES
    (11, 4, 'Morre', 'Laurence', 4, 4500);

INSERT INTO
    employee
VALUES
    (12, 2, 'Brown', 'Madison', 2, 9800);

INSERT INTO
    employee
VALUES
    (13, 4, 'Davis', 'Joshua', 3, 3300);

INSERT INTO
    employee
VALUES
    (14, 4, 'Taylor', 'Olivia', 4, 4500);

INSERT INTO
    employee (employeeid, surname, name, boosid)
VALUES
    (15, 'Morre', 'Madison', 5);

INSERT INTO
    employee
VALUES
    (16, 2, 'Baranowski', 'Jacob', 2, 7600);

INSERT INTO
    employee
VALUES
    (17, 4, 'Jakow', 'Isabella', 4, 5800);

INSERT INTO
    employee
VALUES
    (18, 2, 'Jackson', 'Robert', 2, 7100);

INSERT INTO
    employee
VALUES
    (19, 4, 'Taylor', 'Jurgen', 3, 8200);

INSERT INTO
    employee
VALUES
    (20, 4, 'Willams', 'Emma', 4, 7300);

commit;