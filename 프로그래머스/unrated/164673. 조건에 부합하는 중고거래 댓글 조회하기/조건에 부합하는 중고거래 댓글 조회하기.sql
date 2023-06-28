-- 코드를 입력하세요
SELECT ugb.TITLE, ugb.BOARD_ID, ugr.REPLY_ID, ugr.WRITER_ID, ugr.CONTENTS, date_format(ugr.created_date, '%Y-%m-%d') AS CREATED_DATE
FROM used_goods_board as ugb JOIN used_goods_reply as ugr
ON ugb.board_id = ugr.board_id
WHERE ugb.created_date BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY ugr.created_date, ugb.title