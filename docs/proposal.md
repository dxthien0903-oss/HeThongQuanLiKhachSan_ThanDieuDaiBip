# HỆ THỐNG QUẢN LÝ KHÁCH SẠN (CONSOLE-BASED)

## 1. Thiết kế hệ thống – Thuộc tính các class

---

### 1. Room (Phòng)
**Mô tả:**  
Đại diện cho một phòng trong khách sạn.

**Thuộc tính:**
 -   mã phòng
 -   loại phòng (Single, Double, VIP)
 -   giá phòng / ngày
 -   trạng thái phòng (true: trống, false: đã thuê)

---

### 2. Customer (Khách hàng)
**Mô tả:**  
Lưu thông tin khách hàng.

**Thuộc tính:**
  -  mã khách hàng
  -  họ tên
  -  số điện thoại
 
---

### 3. Booking (Đặt phòng)
**Mô tả:**  
Lưu thông tin đặt phòng giữa khách hàng và phòng.

**Thuộc tính:**
  -  mã đặt phòng
  -  khách hàng
  -  phòng được đặt
  -  số ngày ở
  -  còn hiệu lực hay đã trả phòng

---

### 4. Payment (Thanh toán)
**Mô tả:**  
Lưu thông tin thanh toán khi khách trả phòng.

**Thuộc tính:**
  -  mã thanh toán
  -  mã booking liên quan
  -  số tiền phải trả
  -  ngày thanh toán

---

### 5. RoomManager (Quản lý phòng)
**Mô tả:**  
Quản lý danh sách phòng.

**Thuộc tính:**
- ArrayList<Room> roomList

---

### 6. CustomerManager (Quản lý khách hàng)
**Mô tả:**  
Quản lý danh sách khách hàng.

**Thuộc tính:**
- ArrayList<Customer> customerList

---

### 7. BookingManager (Quản lý đặt phòng)
**Mô tả:**  
Quản lý danh sách đặt phòng.

**Thuộc tính:**
- ArrayList<Booking> bookingList

---

### 8. PaymentManager (Quản lý thanh toán)
**Mô tả:**  
Quản lý lịch sử thanh toán.

**Thuộc tính:**
- ArrayList<Payment> paymentList

---

### 9. Menu
**Mô tả:**  
Hiển thị menu và nhận lựa chọn từ người dùng.

**Thuộc tính:**
- Scanner scanner

---

### 10. HotelManagementSystem
**Mô tả:**  
Class chính điều khiển toàn bộ chương trình.

**Thuộc tính:**
- RoomManager roomManager
- CustomerManager customerManager
- BookingManager bookingManager
- PaymentManager paymentManager
- Menu menu
