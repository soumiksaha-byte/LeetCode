/* Write your PL/SQL query statement below */
SELECT e.name, b.bonus
FROM Employee e
 left JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000 or bonus is null;

