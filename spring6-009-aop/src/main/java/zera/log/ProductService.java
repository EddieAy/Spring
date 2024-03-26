package zera.log;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void insertProduct(){
        System.out.println("新增Product");
    }
    public void deleteProduct(){
        System.out.println("删除Product");
    }
    public void updateProduct(){
        System.out.println("更新Product");
    }
    public void getProduct(){
        System.out.println("获得Product");
    }
}
