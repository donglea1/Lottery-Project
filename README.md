# Lottery-Project
![image](https://user-images.githubusercontent.com/83264542/215263151-e83a5f22-4bd3-4142-96ba-22cea22b2ed5.png)

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Mục lục</summary>
  <ol>
    <li><a href="#ABOUT THE PROJECT">Thông tin dự án</a></li>
    <li><a href="#Framework">Công nghệ sử dụng</a></li>
    <li><a href="#Technical">Kỹ thuật xử lí</a></li>
    <li><a href="#Views">Giao diện trang web</a></li>
    <li><a href="#Controller">Xử lí dữ liệu</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## ABOUT THE PROJECT
 * Xây dựng chức năng dò kết quả xổ số HCM.
 * Sử dụng Bootstrap 5 để thiết kế giao diện trang web.
 * Sử dụng Spring boot để xử lí các chức năng của trang.
 * Sử dụng thư viện Jsoup để bóc tách dữ liệu từ API có sẳn và sàng lọc kết quả.
 * Kiểm tra dữ liệu từ người dùng nhập vào với dữ liệu lấy được từ API để so sánh và thông báo.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Framework

* UI: https://getbootstrap.com/
* Controller: https://spring.io/projects/spring-boot

## Technical
Thư viện Jsoup: https://mvnrepository.com/artifact/org.jsoup/jsoup/1.15.3

## Views
![image](https://user-images.githubusercontent.com/83264542/215264021-fdf3ca76-a1a9-4132-aeb3-76bf23aed4f7.png)

## Controller
 * Validate dữ liệu nhận vào
![image](https://user-images.githubusercontent.com/83264542/215264184-f7d0ce16-0c76-4426-b707-3b7542ddf6d0.png)

 * Lấy dữ liệu từ link API 
 ![image](https://user-images.githubusercontent.com/83264542/215264226-5d782bd5-c3d5-4424-80be-4479d03caff5.png)

 * Sử dụng Jsoup để tách dữ liệu cần lấy
 ![image](https://user-images.githubusercontent.com/83264542/215264258-15334554-8522-4eb5-9216-1cd23282e80b.png)

 * So sánh dữ liệu người dùng với dữ liệu lấy được từ API và trả về thông báo
 ![image](https://user-images.githubusercontent.com/83264542/215264341-a32aeb8a-e9f7-4ad0-a6a1-631270392cd1.png)
 ![image](https://user-images.githubusercontent.com/83264542/215264361-885db8e8-190c-4498-aa9e-73d72ff5a2fa.png)
 

