# HỆ THỐNG QUẢN LÝ KHÁCH SẠN (CONSOLE-BASED)

1️⃣ Room – Phòng


Vai trò
Quản lý thông tin và trạng thái của từng phòng trong khách sạn.

Thuộc tính & mục đích

roomId → Mã định danh duy nhất của phòng

roomNumber → Số phòng hiển thị cho khách

roomType → Loại phòng (liên kết với RoomType)

floor → Tầng của phòng

pricePerNight → Giá thuê theo đêm

isAvailable → Trạng thái phòng (còn trống / đã thuê)

2️⃣ RoomType – Loại phòng


Vai trò
Chuẩn hóa và quản lý các loại phòng trong hệ thống.

Thuộc tính & mục đích

typeId → Mã loại phòng

typeName → Tên loại phòng (Single, Double, VIP…)

maxGuest → Số khách tối đa được ở

basePrice → Giá cơ bản của loại phòng

description → Mô tả tiện nghi của loại phòng

3️⃣ Customer – Khách hàng


Vai trò
Lưu trữ thông tin khách đặt phòng và sử dụng dịch vụ.

Thuộc tính & mục đích

customerId → Mã khách hàng

fullName → Họ và tên khách

phone → Số điện thoại liên hệ

email → Email khách hàng

idCard → CCCD / Passport dùng để xác minh danh tính

4️⃣ Booking – Đặt phòng ⭐ (Class trung tâm)


Vai trò
Liên kết Khách – Phòng – Thời gian lưu trú.

Thuộc tính & mục đích

bookingId → Mã đặt phòng

customer → Khách đặt phòng

room → Phòng được đặt

checkInDate → Ngày nhận phòng

checkOutDate → Ngày trả phòng

status → Trạng thái (Booked, Checked-in, Checked-out, Cancelled)

5️⃣ Service – Dịch vụ


Vai trò
Quản lý các dịch vụ phát sinh ngoài tiền phòng.

Thuộc tính & mục đích

serviceId → Mã dịch vụ

serviceName → Tên dịch vụ (Ăn sáng, Giặt đồ, Spa…)

price → Giá dịch vụ

description → Mô tả chi tiết dịch vụ

6️⃣ ServiceUsage – Sử dụng dịch vụ


Vai trò
Ghi nhận khách đã sử dụng dịch vụ nào trong thời gian lưu trú.

Thuộc tính & mục đích

booking → Booking liên quan

service → Dịch vụ đã sử dụng

quantity → Số lượng / số lần sử dụng

usedDate → Ngày sử dụng dịch vụ

7️⃣ Invoice – Hóa đơn


Vai trò
Tổng hợp toàn bộ chi phí để thanh toán khi khách trả phòng.

Thuộc tính & mục đích

invoiceId → Mã hóa đơn

booking → Booking tương ứng

roomCost → Tổng tiền phòng

serviceCost → Tổng tiền dịch vụ

totalAmount → Tổng số tiền phải thanh toán

8️⃣ Payment – Thanh toán


Vai trò
Quản lý quá trình thanh toán, tách biệt khỏi hóa đơn.

Thuộc tính & mục đích

paymentId → Mã giao dịch thanh toán

invoice → Hóa đơn được thanh toán

paymentMethod → Hình thức thanh toán (Cash, Card, Momo…)

paymentDate → Ngày thanh toán

paymentStatus → Trạng thái (Success, Failed, Pending)

9️⃣ Employee – Nhân viên


Vai trò
Quản lý thông tin nhân viên khách sạn.

Thuộc tính & mục đích

employeeId → Mã nhân viên

fullName → Họ và tên nhân viên

position → Chức vụ (Lễ tân, Quản lý…)

salary → Lương

phone → Số điện thoại liên hệ

🔟 Account – Tài khoản hệ thống


Vai trò
Quản lý đăng nhập và phân quyền sử dụng hệ thống.

Thuộc tính & mục đích

username → Tên đăng nhập

password → Mật khẩu

role → Quyền truy cập (ADMIN, STAFF)

employee → Nhân viên sở hữu tài khoản
