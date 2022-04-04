package product_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product_manager.model.Product;
import product_manager.service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService iProductService;

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
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("smg", "thêm mới thành công");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        iProductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        iProductService.remove(product.getId());
        redirectAttributes.addFlashAttribute("success", "xóa thành công!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/view";
    }
    @PostMapping("/search")
    public String search(@RequestParam String name, Model model){
        List<Product> productList = iProductService.searchByName(name);
        model.addAttribute("products",productList);
        return "/list";
    }

}