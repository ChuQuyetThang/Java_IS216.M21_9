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
- Quản lý sẽ được cấp mục sau:<br/>
  Thêm, sửa, xóa, tra cứu các mục sau:
  + Quản lý sản phẩm 
  + Quản lý khách hàng
  + Quản lý khà cung cấp
  + Quản lý bán hàng
  + Quản lý khuyến mãi
  + Quản lý bảo hành
  + Quản lý nhân viên
  + Quản lý phòng ban
  + Thông kê doanh thu <br/>
- Thống kê doanh thu:<br/>
  + Xuất thông tin báo cáo theo năm,tháng,ngày<br/>
- Nhân viên sẽ được cấp mục sau:
  + Quản lý sản phẩm (<b>thêm, xoá, sửa, tra cứu</b>)
  + Quản lý khách hàng (<b>thêm, xoá, sửa, tra cứu</b>)
  + Quản lý khà cung cấp (<b>thêm, xoá, sửa, tra cứu</b>)
  + Quản lý bán hàng (<b>thêm, xoá, sửa, tra cứu</b>)
  + Quản lý khuyến mãi (<b>thêm, xoá, sửa, tra cứu</b>)
  + Quản lý bảo hành (<b>thêm, xoá, sửa, tra cứu</b>) <br/>
- Tạo account tương ứng cho quản lý, nhân viên và tự động phân quyền theo các role đã được định sẵn. <br/>

  
  
 # <h2 id="yeucau">Yêu cầu hệ thống:</>
- NodeJS 14.18.1
- ASP.NET: .Net 5.0
  
  
  
# <h2 id="caidat">Cài đặt và sử dụng</h2>
## <h3 id="setup">Setup môi trường</h3>
1. Tải và cài đặt NodeJs 14.18.1. Link tải [NodeJS](https://nodejs.org/dist/v14.18.1/node-v14.18.1-x64.msi)
+ Vào cmd gõ 
 ```sh
   npm install yarn -g
   ```
2. Tải mySQL:
- Cách tải bằng docker:

Bước 1: Tải và cài docker desktop
- Link tải: [Docker](https://docs.docker.com/desktop/windows/install/)

Bước 2: Tải MySql trên docker:
- Chạy lệnh Run as administrator Powershell -> gõ lệnh:
```sh
   docker run --name MySQLDB -e MYSQL_ROOT_PASSWORD=1234 -p 3306:3306 -d mysql
   ```
- Sau khi docker đã tải mySQL thì bấm nút run để khởi động mySQL

3. Tải mySQL Workbench - Công cụ làm việc với CSDL mySQL
- Link tải: [mySQL Workbench](https://www.mysql.com/products/workbench/)

4. Tải và cài đặt Visual Studio 2017 trở lên

## <h3 id="start">Khởi động dự án</h3>
### Backend 
- Bước 1: Mở file "CoffeeBook.sln" để khởi động dự án
- Bước 2: migration database 
+ Cách làm: Tools -> Nuget Package Manager -> Package Manager Console.
+ Gõ câu lệnh: 
```sh
   update-database
   ```
- Bước 3: Kiểm tra trong CSDL xem đã có database "CoffeeBook" chưa?
- Bước 4: Nếu đã xong bước migration database, tiếp theo ta chỉ cần run project.

### Frontend
1. Trang Admin (dành cho Admin, Manager, Staff sử dụng)
- Bước 1: tải node-module vào các thư mục "Admin" để chạy React
+ Cách tải: Trỏ đường dẫn vào folder Admin gõ cmd:
  ```sh
   yarn
   ```
- Bước 2: Sau khi đã tải xong node-module, để khởi động trang admin gõ cmd tại đường dẫn tại folder Admin: 
  ```sh
   yarn start
   ```
- Bước 3: Nếu nó thông báo trùng port, muốn chạy trên port khác hay không? Thì nhấn "y" và enter.
- Bước 4: Chờ chương trình sẽ mở ra trang web của dự án.

2. Trang Main (dành cho các customer mua, đặt hàng)
- Bước 1: tải node-module vào các thư mục "Main" để chạy React
+ Cách tải: trỏ đường dẫn vào folder Main gõ cmd:
  ```sh
   yarn
   ```
- Bước 2: Sau khi đã tải xong node-module, để khởi động trang admin gõ cmd tại đường dẫn tại folder Main:
  ```sh
   yarn start
   ```
- Bước 3: Nếu nó thông báo trùng port, muốn chạy trên port khác hay không? Thì nhấn "y" và enter.
- Bước 4: Chờ chương trình sẽ mở ra trang web của dự án.

## <h2 id="lienhe">Liên hệ</h2>

Chu Quyết Thắng, Nguyễn Quốc Trung, Đỗ Mạnh Tuấn

Project Link: [https://github.com/ChuQuyetThang/Java_IS216.M21_9) </br>
Email: [Nhật](mailto:nhatvh.work@gmail.com)

# <h2 id="banquyen">Bản quyền</h3>
Copyright © 2022, [Java_IS216.M21_9](https://github.com/ChuQuyetThang/Java_IS216.M21_9).
# <h2 id="thamkhao">Tài liệu tham khảo</h2> 
- https://www.w3schools.com/
- https://www.reactjs.org/
- https://dotnet.microsoft.com/learn/aspnet/hello-world-tutorial/intro
