package product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product.model.Product;
import product.service.IProductService;
import product.service.impl.ProductServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService iProductService = new ProductServiceImpl();

    @GetMapping("")
    public String list(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("products", productList);
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String Save(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        product.setMa((int) (Math.random() * 1000));
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("smg", "thêm mới thành công");
        return "redirect:/product";

    }

    @GetMapping("/{ma}/edit")
    public String edit(@PathVariable int ma, Model model) {
        model.addAttribute("product", iProductService.findById(ma));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        iProductService.update(product.getMa(), product);
        return "redirect:/product";
    }

    @GetMapping("/{ma}/delete")
    public String delete(@PathVariable int ma, Model model) {
        model.addAttribute("product", iProductService.findById(ma));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        iProductService.remove(product.getMa());
        redirectAttributes.addFlashAttribute("success", "xóa thành công!");
        return "redirect:/product";
    }
@GetMapping("/{ma}/view")
    public String view(@PathVariable int ma , Model model){
        model.addAttribute("product",iProductService.findById(ma));
        return "/view";
}
    @GetMapping("/search")
    public String searchProduct(@RequestParam("searchByName") String searchByName, Model model){

            List<Product> productList = iProductService.findByName(searchByName);

        model.addAttribute("productList",productList);

        return "search";

    }
}
