1. Báo cáo phân tích (Yêu cầu 3)
   Vị trí của số 5 trong URL:

Cách A (/bai3/orders/5): Số 5 nằm ở URI Path (Đường dẫn tài nguyên). Nó đóng vai trò là một phần định danh trực tiếp cho tài nguyên trên server.

Cách B (/bai3/orders?id=5): Số 5 nằm ở Query String (Chuỗi truy vấn). Nó thường được dùng để lọc (filter) hoặc tìm kiếm các thuộc tính của tài nguyên.

Lựa chọn của mình: > Mình chọn Cách A (@PathVariable).

Lý do: Theo tiêu chuẩn thiết kế RESTful API, khi muốn truy cập vào một đối tượng cụ thể và duy nhất (như một ID định danh),
việc dùng @PathVariable giúp URL trở nên tường minh, phân cấp rõ ràng và trông giống như một đường dẫn đến một tập tin/thực thể vật lý.
Cách B thường chỉ nên dùng khi bạn muốn lọc danh sách (ví dụ: lấy các đơn hàng có trạng thái là 'đã giao').


Giải thích lựa chọn:
Em chọn Cách A (Sử dụng @PathVariable) vì đây là cách thiết kế chuẩn RESTful khi muốn định danh một tài nguyên duy nhất thông qua ID. 
Trong Cách A, số "5" đóng vai trò là một biến đường dẫn (Path Variable),
giúp URL /bai3/orders/5 ngắn gọn và phản ánh đúng cấu trúc phân cấp của dữ liệu.
Ngược lại, Cách B thường được ưu tiên cho việc lọc dữ liệu (filtering) hoặc phân trang hơn là lấy một đối tượng cụ thể.

/bai3/orders/5