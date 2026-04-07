package b3;

//Input
// userId: ID người dùng
// foodName: tên món (vd: "Mì xào bò")
// quantity: số lượng

//Output
// Thành công || Thất bại


//Nhận request đặt món từ người dùng :
// 1.Kiểm tra món ăn có tồn tại trong kho không
// 2.Nếu số lượng = 0 → trả về "Hết hàng"
// 3.Tính tổng tiền đơn hàng
// 4.Kiểm tra số dư tài khoản người dùng
// 5.Nếu số dư < giá → trả về "Không đủ tiền"
// 6.Trừ tiền trong tài khoản
// 7.Trừ số lượng món trong kho
// 8.Trả về "Đặt món thành công"
