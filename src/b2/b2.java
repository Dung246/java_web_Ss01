package b2;

//Trong Spring, Bean mặc định có scope là Singleton, nghĩa là chỉ có một instance duy nhất trong toàn bộ ứng dụng.
//Khi sử dụng Singleton cho PlaySession (một đối tượng chứa trạng thái riêng của từng người dùng), tất cả các máy trạm sẽ dùng chung một instance, dẫn đến việc dữ liệu thời gian chơi bị chia sẻ và ghi đè lẫn nhau, gây ra lỗi tính tiền sai.
