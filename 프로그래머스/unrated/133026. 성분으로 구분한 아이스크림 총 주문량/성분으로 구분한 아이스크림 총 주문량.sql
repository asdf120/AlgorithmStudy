-- 코드를 입력하세요
SELECT ii.INGREDIENT_TYPE, SUM(fh.total_order) TOTAL_ORDER
FROM FIRST_HALF as fh JOIN ICECREAM_INFO as ii
ON fh.flavor = ii.flavor
GROUP BY ii.ingredient_type