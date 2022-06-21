-------DANH SACH CAC PROCEDURE


--PRO1: THEM NHA CUNG CAP
create or replace PROCEDURE them_nhacungcap( ma_ncc nhacungcap.mancc%type, ten_ncc nhacungcap.tenncc%type, dia_chi nhacungcap.diachi%type, email_ncc  nhacungcap.email%type,
sdt_ncc nhacungcap.sdt%type)
as
sname nhacungcap.mancc%type;
begin
select mancc into sname
from nhacungcap
where ma_ncc=mancc;
DBMS_OUTPUT.PUT_LINE('da ton tai nha cung cap co ma :'||sname);
EXCEPTION WHEN NO_DATA_FOUND THEN
insert into nhacungcap(mancc,tenncc,diachi,email,sdt)  values  (ma_ncc,ten_ncc,dia_chi,email_ncc,sdt_ncc);
DBMS_OUTPUT.PUT_LINE('Them thanh cong');
end;

--PRO2: TRA CUU NHA CUNG CAP
CREATE OR REPLACE PROCEDURE tracuu_nhacungcap( ma_ncc NHACUNGCAP.MANCC%TYPE)
as
sname varchar2(300);
begin
select mancc||', '||tenncc||', '||diachi||', '||email||', '||sdt into sname
from nhacungcap
where ma_ncc=mancc;
DBMS_OUTPUT.PUT_LINE(sname);
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI NHA CUNG CAP NAY');
end;

--PRO3: XOA NHA CUNG CAP
CREATE OR REPLACE PROCEDURE xoa_nhacungcap( ma_ncc NHACUNGCAP.MANCC%TYPE)
as
begin
delete from nhacungcap
where mancc=ma_ncc;
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI NHA CUNG CAP NAY');
end;

--PRO4: CAP NHAT NHA CUNG CAP
create or replace PROCEDURE capnhat_nhacungcap( ma_ncc nhacungcap.mancc%type, ten_ncc nhacungcap.tenncc%type, dia_chi nhacungcap.diachi%type, email_ncc  nhacungcap.email%type,
sdt_ncc nhacungcap.sdt%type)
as
begin
update nhacungcap
set tenncc=ten_ncc,diachi=dia_chi,email=email_ncc,sdt=sdt_ncc
where mancc=ma_ncc;
DBMS_OUTPUT.PUT_LINE('cap nhat thanh cong ');
end;

--PRO4: THEM KHUYEN MAI
create or replace PROCEDURE them_khuyenmai( ma_km KHUYENMAI.MAKM%TYPE, ten_km khuyenmai.tenkm%type, ngay_bd khuyenmai.ngaybd%type, ngay_kt khuyenmai.ngaykt%type,
phantram khuyenmai.phantramkm%type)
as
sname khuyenmai.makm%type;
begin
select makm into sname
from khuyenmai
where ma_km=makm;
DBMS_OUTPUT.PUT_LINE('da ton tai khuyen mai co ma :'||sname);
EXCEPTION WHEN NO_DATA_FOUND THEN
insert into khuyenmai(makm,tenkm,ngaybd,ngaykt,phantramkm)  values  (ma_km,ten_km,ngay_bd,ngay_kt,phantram);
DBMS_OUTPUT.PUT_LINE('Them thanh cong');
end;

--PRO5: TRA CUU KHUYEN MAI
CREATE OR REPLACE PROCEDURE tracuu_khuyenmai( ma_km KHUYENMAI.MAKM%TYPE)
as
sname varchar2(300);
begin
select MAKM||', '||TENKM||', '||NGAYBD||'-'||NGAYKT||', '||PHANTRAMKM into sname
from nhacungcap
where ma_km=MAKM;
DBMS_OUTPUT.PUT_LINE(sname);
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI KHUYEN MAI NAY');
end;

--PRO6: XOA KHUYEN MAI
CREATE OR REPLACE PROCEDURE xoa_khuyenmai( ma_km KHUYENMAI.MAKM%TYPE)
as
begin
delete from khuyenmai
where MAKM=ma_km;
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI khuyenmai NAY');
end; 

--PRO7: CAP NHAT KHUYEN MAI
create or replace PROCEDURE capnhat_khuyenmai( ma_km KHUYENMAI.MAKM%TYPE, ten_km khuyenmai.tenkm%type, ngay_bd khuyenmai.ngaybd%type, ngay_kt khuyenmai.ngaykt%type,
phantram khuyenmai.phantramkm%type)
as
begin
update khuyenmai
set tenkm=ten_km, ngaybd=ngay_bd,ngaykt=ngay_kt,phantramkm=phantram
where ma_km=makm;
DBMS_OUTPUT.PUT_LINE('cap nhat thanh cong ');
end;

--PRO8: THEM BAO HANH
create or replace PROCEDURE them_baohanh( ma_bh baohanhsp.mabh%TYPE, ma_sp baohanhsp.masp%type, ngay_bh baohanhsp.ngaybh%type, chiphi_bh baohanhsp.chiphibh%type,
mota_loi baohanhsp.motaloi%type)
as
sname baohanhsp.mabh%type;
begin
select mabh into sname
from baohanhsp
where ma_bh=mabh;
DBMS_OUTPUT.PUT_LINE('da ton tai bao hanh co ma :'||sname);
EXCEPTION WHEN NO_DATA_FOUND THEN
insert into baohanhsp(mabh,masp,ngaybh,chiphibh,motaloi)  values  (ma_bh,ma_sp,ngay_bh,chiphi_bh,mota_loi);
DBMS_OUTPUT.PUT_LINE('Them thanh cong');
end;

--PRO9:TRA CUU BAO HANH
CREATE OR REPLACE PROCEDURE tracuu_baohanh( ma_bh BAOHANHSP.MABH%TYPE)
as
sname varchar2(300);
begin
select MABH||', '||MASP||', '||NGAYBH||', '||CHIPHIBH||', '||MOTALOI into sname
from baohanhsp
where ma_bh=MABH;
DBMS_OUTPUT.PUT_LINE(sname);
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI BAO HANH NAY');
end;

--PRO10: XOA BAO HANH:
CREATE OR REPLACE PROCEDURE xoa_baohanh( ma_bh BAOHANHSP.MABH%TYPE)
as
begin
delete from baohanhsp
where ma_bh=MABH;
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI BAO HANH NAY');
end;

--PRO11: CAP NHAT BAO HANH
create or replace PROCEDURE capnhat_baohanh( ma_bh baohanhsp.mabh%TYPE, ma_sp baohanhsp.masp%type, ngay_bh baohanhsp.ngaybh%type, chiphi_bh baohanhsp.chiphibh%type,
mota_loi baohanhsp.motaloi%type)
as
begin
update baohanhsp
set masp=ma_sp, ngaybh=ngay_bh,chiphibh=chiphi_bh,motaloi=mota_loi
where ma_bh=mabh;
DBMS_OUTPUT.PUT_LINE('cap nhat thanh cong ');
end;

--PRO12: THEM SAN PHAM
CREATE OR REPLACE PROCEDURE them_sanpham(ma_sp SANPHAM.MaSP%TYPE,ma_km KHUYENMAI.MaKM%TYPE,
                                            ma_ncc NHACUNGCAP.MANCC%TYPE,tensp SANPHAM.TenSP%TYPE,
                                            mausac SANPHAM.MAUSAC%TYPE,dongia SANPHAM.DonGia%TYPE,
                                            soluong SANPHAM.SoLuong%TYPE)
AS
    masanpham SANPHAM.MaSP%TYPE := NULL;
    TONGSLSP NUMBER;
BEGIN
    SELECT MaSP INTO masanpham
    FROM SANPHAM
    WHERE MaSP=ma_sp;
    BEGIN
        TONGSLSP:=tongsanpham;
    END;
    IF (masanpham IS NOT NULL) THEN
        DBMS_OUTPUT.PUT_LINE('Ma san pham da ton tai, vui long nhap lai');
    ELSIF (TONGSLSP >=300) THEN
        DBMS_OUTPUT.PUT_LINE('Tong san pham da day, khong the them san pham');
    END IF;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        INSERT INTO SANPHAM (MaSP,MaKM,MaNCC,TenSP,MauSac,DonGia,SoLuong) 
        VALUES (ma_sp,ma_km,ma_ncc,tensp,mausac,dongia,soluong);
        DBMS_OUTPUT.PUT_LINE('Them thanh cong');
END;

--PRO13: XOA SAN PHAM
CREATE OR REPLACE PROCEDURE xoa_sanpham(ma_sp SANPHAM.MaSP%TYPE)
AS
BEGIN
    DELETE FROM SANPHAM WHERE MaSP=ma_sp;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('Xoá khong thanh cong');
END;

--PRO14: TRA CUU SAN PHAM
CREATE OR REPLACE PROCEDURE tracuu_sanpham(ma_sp SANPHAM.MaSP%TYPE)
as
sname varchar2(300);
begin
select MaSP || ' ' ||MaKM || ' ' ||MaNCC || ' ' ||TenSP || ' ' ||MauSac || ' ' ||DonGia || ' ' || SoLuong into sname
from sanpham
where MaSP=ma_sp;
DBMS_OUTPUT.PUT_LINE(sname);
EXCEPTION 
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('KHONG TON TAI SAN PHAM NAY');
end;

--PRO15: CAP NHAT SAN PHAM
create or replace PROCEDURE capnhat_baohanh( ma_sp SANPHAM.MaSP%TYPE,ma_km KHUYENMAI.MaKM%TYPE,
                                            ma_ncc NHACUNGCAP.MANCC%TYPE,tensp SANPHAM.TenSP%TYPE,
                                            mausac SANPHAM.MAUSAC%TYPE,dongia SANPHAM.DonGia%TYPE,
                                            soluong SANPHAM.SoLuong%TYPE)
as
begin
update SANPHAM
set Masp=ma_sp,MaKM=ma_km,MaNCC=ma_ncc,TenSP=tensp,MauSac=mausac,DonGia=dongia,SoLuong=soluong
where MaSP=ma_sp;
DBMS_OUTPUT.PUT_LINE('cap nhat thanh cong ');
end;

--PRO16: Doanh thu ban hang trong thang
CREATE OR REPLACE PROCEDURE doanhthu_thang(thang NUMBER,nam NUMBER)
AS 
    doanhthu NUMBER;
BEGIN
    SELECT SUM(TriGia) INTO doanhthu
    FROM HD_BANSP
    WHERE EXTRACT(YEAR FROM NgayLapHD)= nam and EXTRACT(MONTH FROM NgayLapHD)=thang;
    DBMS_OUTPUT.PUT_LINE('Doanh thu cua thang '||thang||',nam '||nam||' : '||doanhthu);
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Tinh doanh thu khong thanh cong');
END;

--PRO17: Cap nhat tri gia cua hoá don khi thay doi don gia cua san pham
CREATE OR REPLACE PROCEDURE update_trigia(ma_sp SANPHAM.MaSP%TYPE)
AS
    so_hd HD_BANSP.SoHD%TYPE;
    DONGIA SANPHAM.DonGia%TYPE;
    SL CTHD_BANSP.SoLuongMua%TYPE;
    ma_km KHUYENMAI.MaKM%TYPE;
    ptkm KHUYENMAI.PhanTramKM%TYPE;
BEGIN
    SELECT CT.SoHD, SP.DonGia,CT.SoLuongMua,SP.MaKM INTO so_hd,DONGIA,SL,ma_km
    FROM SANPHAM SP JOIN CTHD_BANSP CT ON SP.MaSP=CT.MaSP
    WHERE SP.MaSP=ma_sp;
    SELECT PhanTramKM INTO ptkm
    FROM SANPHAM SP JOIN KHUYENMAI KM ON SP.MaKM=KM.MaKM
    WHERE SP.MaKM=ma_km;
    UPDATE HD_BANSP SET TriGia=((DONGIA*SL)-(DONGIA*ptkm/100)*SL) WHERE SoHD=so_hd;
END;

--PRO18: Hien thi so hoa don ban hang trong thang
CREATE OR REPLACE PROCEDURE sohoadon_thang(thang NUMBER,nam NUMBER)
AS 
    sohoadon NUMBER;
BEGIN
    SELECT COUNT(SoHD) INTO sohoadon
    FROM HD_BANSP
    WHERE EXTRACT(YEAR FROM NgayLapHD)= nam and EXTRACT(MONTH FROM NgayLapHD)=thang;
    DBMS_OUTPUT.PUT_LINE('So hoa don cua thang '||thang||',nam '||nam||' : '||sohoadon);
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Khong co du lieu');
END;

--PRO19: Hien thi so hoa don khach hang do mua trong nam
CREATE OR REPLACE PROCEDURE soHDKH_nam(ma_KH HD_BANSP.MAKH%TYPE,nam NUMBER)
AS
    sohoadon NUMBER;
BEGIN
    SELECT COUNT(SoHD) INTO sohoadon
    FROM HD_BANSP
    WHERE EXTRACT(YEAR FROM NgayLapHD)= nam AND MaKH = ma_KH
    GROUP BY MAKH;
    DBMS_OUTPUT.PUT_LINE('So hoa don cua khach hang ' || ma_KH|| ' trong nam '||nam||' : '||sohoadon);
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Khong co du lieu');
END;

-------------------------DANH SACH FUNCTION


--FUN1: Tinh tong san pham
CREATE OR REPLACE FUNCTION tongsanpham
RETURN NUMBER
AS
    TONGKHO NUMBER;
BEGIN
    SELECT SUM(SoLuong) INTO TONGKHO
    FROM SANPHAM;
    RETURN TONGKHO;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Tinh tong khong thanh cong');
END;

--FUN2: Tinh luong nhan vien
CREATE OR REPLACE FUNCTION tinhluongNV(ma_nv NHANVIEN.MaNV%TYPE,mucluong NUMBER)
RETURN NUMBER
AS
    luong NUMBER;
    snlv NHANVIEN.SoNgayLam%TYPE;
BEGIN
    SELECT SoNgayLam INTO snlv
    FROM NHANVIEN
    WHERE MaNV=ma_nv;
    luong:=snlv*mucluong;
    RETURN luong;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Tinh tong khong thanh cong');
END;

--FUN3: Doanh thu ban hang trong nam
CREATE OR REPLACE FUNCTION doanhthu_nam(nam NUMBER)
RETURN NUMBER
AS
    DOANHTHU NUMBER;
BEGIN
    SELECT SUM(TRIGIA) INTO DOANHTHU
    FROM HD_BANSP
    WHERE EXTRACT(YEAR FROM NgayLapHD)= nam;
    RETURN DOANHTHU;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Tinh doanh thu khong thanh cong');
END;


--------------DANH SACH TRIGGER


---TRIG1: Kiem tra và cap nhat so luong nhân viên khi them 1 nhan vien
CREATE OR REPLACE TRIGGER check_update_soluongNV_forinsert
BEFORE INSERT ON NHANVIEN
FOR EACH ROW
DECLARE
    slnv PHONGBAN.SoLuongNV%TYPE;
BEGIN
    SELECT COUNT(MaNV) INTO slnv
    FROM NHANVIEN
    WHERE MaPB=:NEW.MaPB
    GROUP BY :NEW.MaPB;
    IF ((10-slnv)<1) THEN
        RAISE_APPLICATION_ERROR(-20000,'So luong nhan vien da day');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Them nhan vien thanh cong');
        UPDATE PHONGBAN SET SoLuongNV=SoLuongNV+1 WHERE MaPB=:NEW.MaPB;
    END IF;
END;


---TRIG2: Kiem tra va cap nhat so luong nhan vien khi xoa 1 nhan vien
CREATE OR REPLACE TRIGGER check_update_soluongNV_fordelete
AFTER DELETE ON NHANVIEN
FOR EACH ROW
DECLARE
    slnv PHONGBAN.SoLuongNV%TYPE;
BEGIN
    SELECT COUNT(MaNV) INTO slnv
    FROM NHANVIEN
    WHERE MaPB=:OLD.MaPB
    GROUP BY :OLD.MaPB;
    IF (slnv<1) THEN
        UPDATE PHONGBAN SET SoLuongNV=0 WHERE MaPB=:OLD.MaPB;
        DBMS_OUTPUT.PUT_LINE('Da xoa nhan vien cuoi cung cua phong ban');
    ELSE
        UPDATE PHONGBAN SET SoLuongNV=SoLuongNV-1 WHERE MaPB=:OLD.MaPB;
    END IF;
END;


--TRIG3: Kiem tra them khuyen mai
CREATE OR REPLACE TRIGGER check_ngkm
BEFORE INSERT ON KHUYENMAI
FOR EACH ROW
DECLARE
BEGIN
    IF TO_DATE(:NEW.NgayKT,'dd/mm/yyyy') < TO_DATE(:NEW.NgayBD,'dd/mm/yyyy') THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay ket thuc khong hop le,vui long nhap lai');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Nhap ngay ket thuc thanh cong');
    END IF;
END;


--TRIG4: Kiem tra cap nhat ngay khuyen mai
CREATE OR REPLACE TRIGGER check_update_ngkm
BEFORE UPDATE ON KHUYENMAI
FOR EACH ROW
DECLARE
BEGIN
    IF TO_DATE(:NEW.NgayKT,'dd/mm/yyyy') < TO_DATE(:NEW.NgayBD,'dd/mm/yyyy') THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay ket thuc khong hop le,vui long nhap lai');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Nhap ngay ket thuc thanh cong');
    END IF;
END;


--TRIG5: Kiem tra them bao hanh
CREATE OR REPLACE TRIGGER check_ngbh
BEFORE INSERT ON PHIEUBAOHANH
FOR EACH ROW
DECLARE
BEGIN
    IF TO_DATE(:NEW.NgayHetHan,'dd/mm/yyyy') < TO_DATE(:NEW.NgayBatDau,'dd/mm/yyyy') THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay ket thuc khong hop le,vui long nhap lai');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Nhap ngay ket thuc thanh cong');
    END IF;
END;



---TRIG6: Kiem tra cap nhat bao hanh
CREATE OR REPLACE TRIGGER check_update_ngbh
BEFORE UPDATE ON PHIEUBAOHANH
FOR EACH ROW
DECLARE
BEGIN
    IF TO_DATE(:NEW.NgayHetHan,'dd/mm/yyyy') < TO_DATE(:NEW.NgayBatDau,'dd/mm/yyyy') THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay ket thuc khong hop le,vui long nhap lai');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Nhap ngay ket thuc thanh cong');
    END IF;
END;


--TRIG7: Them 1 hoa don phai co it nhat 1 so hoa don trong chi tiet hoa don
CREATE OR REPLACE TRIGGER them_hd
BEFORE INSERT ON HD_BANSP
FOR EACH ROW
DECLARE 
    so_hd HD_BANSP.SoHD%TYPE;
BEGIN
    so_hd:=:NEW.SoHD;
    INSERT INTO CTHD_BANSP VALUES(so_hd,'NONE',0);
    DBMS_OUTPUT.PUT_LINE('Them thanh cong, can update lai cthd(masp,soluongmua)');
END;

---TRIG8: Xoa hoa don cuoi cung o chi tiet hoa don thi xoa hoa don do o hoa don
CREATE OR REPLACE TRIGGER xoa_cthd
AFTER DELETE ON CTHD_BANSP
FOR EACH ROW
DECLARE
   SOLUONG NUMBER;
   so_hd CTHD_BANSP.SoHD%TYPE;
BEGIN
    so_hd:=:OLD.SOHD;
    SELECT COUNT(so_hd) INTO soluong
    FROM CTHD_BANSP CT
    WHERE CT.SoHD=so_hd
    GROUP BY so_hd;
    IF(soluong <1) THEN
        DELETE FROM HD_BANSP WHERE SoHD=so_hd;
        DBMS_OUTPUT.PUT_LINE('Xoa cthd cuoi cung cua hoa don tren');
    END IF;
END;
