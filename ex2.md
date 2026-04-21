Hướng dẫn Liam kiểm tra (Test Case):
Case 1: Quên truyền tham số (Đây là mục tiêu chính của bài 2)

URL: http://localhost:8080/ex0_war_exploded/bai2/menu

Kết quả: Hiển thị thực đơn loại CHAY (do có defaultValue).

Case 2: Truyền loại mặn

URL: http://localhost:8080/ex0_war_exploded/bai2/menu?category=mặn

Kết quả: Hiển thị thực đơn loại MẶN.

Case 3: Truyền loại linh tinh

URL: http://localhost:8080/ex0_war_exploded/bai2/menu?category=haisan

Kết quả: Hiển thị thông báo "đang cập nhật" cho loại haisan.