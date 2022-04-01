<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="create.css">
</head>
<body>
<h3><strong>Tờ khai y tế</strong></h3>
<h3>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP Cơ QUAN Y TÉ LIÊN LẠC KHI CÀN THIẾT ĐỂ PHÒNG CHÓNG
    DỊCH BỆNH TRUYỀN NHIỄM</h3>
<h5 style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình
    sự</h5>
<div id="form">
    <form:form modelAttribute="toKhai" action="/created" method="post" >

        <tr>
            <td><p>Họ tên(ghi chữ IN HOA)</p></td>
            <form:input path="ten" />
        </tr>
        <tr>
            <td><p>Năm Sinh</p>
                <form:input path="namSinh"/>
            </td>
            <td><p>Giới tính</p>
                <form:select path="gioiTinh">
                    <form:option value="-1" label="Chọn"/>
                    <form:option value="0" label="Nam"/>
                    <form:option value="1"  label="Nữ"/>
                </form:select></td>
            <td>
                <p>Quốc tịnh</p>
                <form:input path="quocTinh"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</p>
                <form:input path="cmnd"/>
            </td>

        </tr>
        <tr>
            <td>
                <p>Thông tin đi lại</p>
                <form:radiobuttons path="thongTinDiLai" items="${thongTinDiLaiList}"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Số hiệu phương tiện</p>
                <form:input path="soHieu"/>
            </td>
            <td>
                <p>Số ghế</p>
                <form:input path="soGhe"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Ngày khởi hành</p>
                <form:input path="ngayKhoiHanh"/>
            </td>
            <td>
                <p>Ngày kết thúc</p>
                <form:input path="ngayKetThuc"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành nào?</p>
                <form:input path="diaDiemDaDen"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Địa chỉ liên lạc</p>
                <p>Tỉnh / thành</p>
                <form:input path="tinhThanhLienLac"/>
            </td>
            <td>
                <p>Quận / huyện</p>
                <form:input path="quanHuyenLienLac"/>
            </td>
            <td>
                <p>Phường / xã</p>
                <form:input path="phuongXaLienLac"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Địa chỉ nơi ở</p>
                <form:input path="diaChiNoiO"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Điện thoại</p>
                <form:input path="sdt"/>
            </td>
            <td>
                <p>Email</p>
                <form:input path="email"/>
            </td>
        </tr>
        <button type="submit">Gửi tờ khai</button>
    </form:form>
</div>

</body>
</html>
