-- 코드를 입력하세요
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(start_date, '%Y-%m-%d') as START_DATE, DATE_FORMAT(end_date, '%Y-%m-%d') as END_DATE, '단기 대여' AS RENT_TYPE
FROM car_rental_company_rental_history
WHERE DATE_FORMAT(DATE_SUB(end_date, INTERVAL 29 DAY), '%y-%m-%d') < start_date
  AND start_date like '2022-09%'
UNION
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(start_date, '%Y-%m-%d') as START_DATE, DATE_FORMAT(end_date, '%Y-%m-%d') as END_DATE, '장기 대여' AS RENT_TYPE
FROM car_rental_company_rental_history
WHERE DATE_FORMAT(DATE_SUB(end_date, INTERVAL 29 DAY), '%y-%m-%d') >= start_date
  AND start_date like '2022-09%'
ORDER BY history_id DESC