package blog.controller;

import blog.model.Blog;
import blog.model.Category;
import blog.service.IBlogService;
import blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequestMapping("blog")
@Controller
public class BlogController {

    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String list(@RequestParam Optional<String> keyword, Model model, @PageableDefault(value = 3)Pageable pageable ) {
        Page<Blog> blogList;
        if(keyword.isPresent()){
            blogList = iBlogService.findByName(keyword.get(), pageable);

        }else {
            blogList = iBlogService.findAll(pageable);
        }

        model.addAttribute("blogList", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<Category> categoryLs = iCategoryService.findAllCategory();
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryLs",categoryLs);
        return "/create";
    }

    @PostMapping("/save")
    public String Save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blog.setDate(LocalDate.now().toString());
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("smg", "thêm mới thành công");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {

       List<Category>categoryList = iCategoryService.findAllCategory();
        model.addAttribute("blog", iBlogService.findById(id));
        model.addAttribute("categoryList",categoryList);

        return "/edit";

    }

    @PostMapping("/update")
    public String update( Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("success", "xóa thành công!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/view";
    }
    @GetMapping("/category/{idCategory}")
    public String listCategory(@PathVariable Integer idCategory , Model model){
        List<Blog> blogList = iBlogService.findBlogCategoryById(idCategory);
        model.addAttribute("blogList",blogList);
        model.addAttribute("title",blogList.get(0).getCategory().getName());
        return "category";
    }

}
