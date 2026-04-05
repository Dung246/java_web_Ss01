package b3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFoodService {

    private final b3.b3.InventoryRepository inventoryRepo;
    private final UserAccountRepository userRepo;
    @Autowired
    public OrderFoodService(InventoryRepository inventoryRepo,
                            UserAccountRepository userRepo) {
        this.inventoryRepo = inventoryRepo;
        this.userRepo = userRepo;
    }

    public String orderFood(String username, String foodName, int quantity) {

        // 1. Check tồn tại + kho
        int stock = inventoryRepo.getStock(foodName);
        if (stock <= 0) {
            return "Hết món trong kho";
        }

        if (stock < quantity) {
            return "Không đủ số lượng";
        }

        // 2. Tính tiền
        double price = inventoryRepo.getPrice(foodName);
        double total = price * quantity;

        // 3. Check tiền user
        double balance = userRepo.getBalance(username);
        if (balance < total) {
            return "Tài khoản không đủ tiền";
        }

        // 4. Xử lý
        userRepo.deductBalance(username, total);
        inventoryRepo.reduceStock(foodName, quantity);

        return "Đặt món thành công";
    }
}
public class b3 {
    //Các bước
    //Nhận request (username, foodName, quantity)
    //Kiểm tra món tồn tại trong kho
    //Kiểm tra số lượng tồn
    //Tính tổng tiền
    //Kiểm tra số dư user
    //Nếu OK:
    //Trừ tiền
    //Trừ kho
    //Trả kết quả
    public interface InventoryRepository {
        int getStock(String foodName);
        double getPrice(String foodName);
        void reduceStock(String foodName, int quantity);
    }
}
