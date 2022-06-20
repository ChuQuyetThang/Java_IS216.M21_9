# <h1 align="center">Java_IS216.M21_9<h1>

  
<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="">
  </a>

  <h3 align="center">Điện thoại đi động</h3>

  <p align="center">
    Hệ thống quản lý bán hàng điện thoại di động
    <br />
    <a href="https://github.com/ChuQuyetThang/Java_IS216.M21_9"><strong>Khám phá »</strong></a>
    <br />
    <br />
  </p>
</div>

  
  
  <!-- TABLE OF CONTENTS -->
<details>
  <summary>Mục lục</summary>
  <ol>
    <li>
      <a href="#muctieu">Mục tiêu đồ án</a>
    </li>
    <li>
      <a href="#dsthanhvien">Danh sách thành viên</a>
    </li>
    <li><a href="#thuvien">Các thư viện</a></li>
    <li>
      <a href="#chucnang">Các chức năng</a>
    </li>
    <li><a href="#yeucau">Yêu cầu hệ thống</a></li>
    <li>
      <a href="#caidat">Cài đặt và sử dụng</a>
      <ul><a href="#setup">Setup môi trường</a></ul>
      <ul><a href="#start">Khởi động dự </a></ul>
    </li>
    <li><a href="#lienhe">Liên hệ</a></li>
    <li><a href="#banquyen">Bản quyền</a></li>
    <li><a href="#thamkhao">Tài liệu tham khảo</a></li>
  </ol>
</details>
  
  
  <!-- ABOUT THE PROJECT -->
## <h2 id="muctieu">Mục tiêu của đồ án</h2>
Đề ra phương án xây dựng ứng dụng quản lý đòi hỏi các yêu cầu mang tính thuyết phục và chặt chẽ, nêu ra được tính thiết yếu như:
- Quản lý nắm bắt được thông tin khách hàng, nhà cung cấp một cách hiệu quả và nhanh chóng.
- Quản lý thông tin xuất và nhập các sản phẩm mới lên hệ thống mỗi ngày để khách hàng nắm bắt và tham khảo.
- Cập nhật tình hình doanh số mua bán trong cửa hàng và các cửa hàng chung hệ thống.
- Quản lý được số liệu sản phẩm còn/hết trong kho và số liệu thông tin liên quan đến sản phẩm .
- Đơn giản hóa quá trình mua bán sản phẩm online đối với các khách hàng có nhu cầu đặt qua ứng dụng.
- Quản lý được nhu cầu đóng góp ý kiến và phản hồi của khách hàng bằng cách tạo một kênh liên lạc dành riêng cho khách mua hàng
- Kết hợp với các sự kiện ưu đãi khuyến mãi trên ứng dụng giúp khách hàng có thể nắm bắt và hiểu rõ hơn về chương trình được áp dụng vào từng thiết bị sản phẩm.
- Quản lý thông tin bảo hành , giao dịch của khách hàng.
- Quản lý tình hình nhân viên trong công tác làm việc.
- Cập nhật được thông tin sản phẩm cần nhập hàng, tiền hàng nhập sản phẩm.
Với các yêu cầu đề xuất trên là mục tiêu trong phần mềm quản lý đối với cửa hàng bán điện thoại di động. Khi áp dụng vào thực tiễn sẽ giảm bớt tối ưu các phương pháp thủ công và làm hiện đại hơn quá trình mua bán giữa khách hàng và nhà sản xuất. Tiếp cận được khách hàng một cách hiệu quả và không tốn nhiều thời gian chỉ cần truy cập ứng dụng.
## <h2 id="dsthanhvien">Các thành viên tham gia project</h2>
 
| STT| Họ tên            | MSSV     | FB                                                                           |   SĐT     |     Nhiệm vụ     |   Đánh giá % |
|:--:|-------------------|----------|------------------------------------------------------------------------------|-----------|------------------|--------------|
| 1  | Chu Quyết Thắng   | 20521892 |[Quyết Thắng](https://www.facebook.com/chuquyetthang2952)                     |0353241981 |Trưởng nhóm, Code |     25       |
| 2  | Nguyễn Quốc Trung | 20522073 |[Nguyễn Quốc Trung](https://www.facebook.com/profile.php?id=100038858731211)  |0378269526 |Code              |     35       | 
| 3  | Đỗ Mạnh Tuấn      | 20522108 |[Mạnh Tuấn](https://www.facebook.com/23072002td)                              |0355978908 |Code              |     20       |
| 4  | Nguyễn Ngọc Thảo  | 20521933 |[Ngọc Thảo](https://www.facebook.com/profile.php?id=100009468992615)          |0923109817 |Tester            |     20       |
  
  
  
### <h2 id="thuvien">Các thư viện sử dụng</h2>

Hệ thống được xây dựng dựng bởi các thư viện hiện đại:
* Frontend: [React.js](https://reactjs.org/) + [Bootstrap](https://getbootstrap.com) + [JQuery](https://jquery.com)
* Backend: [ASP .NET](https://dotnet.microsoft.com)
  
  
  # <h2 id="chucnang">Tóm tắt chức năng</h2>
- Quản lý sản phẩm:<br/>
  + Đăng nhập, đăng ký, lấy lại mật khẩu
  + Mua và đặt hàng,sử dụng khuyến mãi
  + Xem thông tin vận đơn
  + Xem thông tin cơ bản của account khách hàng, cập nhật lại profile 
  + Nhận Email cảm ơn
  + Tra cứu cửa hàng , vị trí trên Google Map
  + Đọc tin tức <br/>
- Quản lý khách hàng:<br/>
  Thêm sửa xóa các mục sau:
  + Hóa đơn,đơn hàng 
  + Tài khoản (account)
  + Danh sách khách hàng,nhân viên, quản lý
  + Danh sách các cửa hàng
  + Nhà cung cấp
  + Danh sách sản phẩm,tin tức
  + Nhóm quyền
  + Loại sản phẩm
  + Khuyến mãi <br/>
- Quản lý nhà cung cấp:<br/>
  + Kiểm tra được thông tin theo từng năm,tháng,ngày
  + Xuất thông tin báo cáo theo năm,tháng,ngày<br/>
- Quản lý bán hàng:
  + Hóa đơn,đơn hàng (<b>chỉ xem và hủy đơn hàng</b>)
  + Danh sách khách hàng (<b>chỉ xem</b>)
  + Danh sách nhân viên(<b>Thêm xóa sửa</b>)
  + Danh sách các cửa hàng(<b>Chỉ xem chính cửa hàng đang được sở hữu</b>)
  + Danh sách sản phẩm,tin tức(<b>thêm xóa sửa</b>)
  + Loại sản phẩm(<b>thêm xóa sửa</b>)
  + Khuyến mãi (<b>thêm xóa sửa</b>)<br/>
- Quản lý khuyến mãi:
  + Hóa đơn,đơn hàng (<b>chỉ xem</b>)
  + Danh sách khách hàng (<b>chỉ xem</b>)
  + Danh sách sản phẩm,tin tức (<b>chỉ xem</b>)
  + Loại sản phẩm (<b>chỉ xem</b>)
  + Khuyến mãi (<b>chỉ xem</b>) <br/>
- Quản lý bảo hành:<br/>
  + Hóa đơn,đơn hàng (<b>Xóa , Hoàn tất đơn hàng</b>) <br/>
- Quản lý nhân viên:<br/>
- Quản lý phòng ban:<br/>
- Thống kê doanh thu:<br>
- Bảng thống kê doanh thu sẽ được tự động cập nhật khi người dùng chọn ngày và xuất thông tin thành file excel đúng như người dùng thấy trên bảng kết quả. <br/>
- Khi admin muốn chuyển quản lý sang một cửa hàng khác thì tự động quản lý ở cửa hàng cũ sẽ không tồn tại quản lý. <br/>
- Tạo account tương ứng cho quản lý, nhân viên và tự động phân quyền theo các role đã được định sẵn. <br/>
