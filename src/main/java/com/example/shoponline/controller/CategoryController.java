package com.example.shoponline.controller;

import com.example.shoponline.entities.Category;
import com.example.shoponline.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Object;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Category")
public class CategoryController {

    @Autowired

    private ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService){
        this.iCategoryService=iCategoryService;
    }

    @GetMapping("/getAllCategory")
    private List<Category> getAllProduct(){
        return iCategoryService.getAllCategory();
    }
    @GetMapping("/getAllCategoryByActive")
    private List<Category> getCategoriesByActive(@RequestParam boolean active){
        return iCategoryService.getCategoriesByActive(active);
    }

    @PostMapping("/addCategory")
    private Boolean saveCategory(@RequestBody Category newCategory){
        return  iCategoryService.saveCategory(newCategory);
    }
    @GetMapping("/getCategoryData")
    private List<Object> getCategoryData(){
        return iCategoryService.getCategoryData();
    }

    @PutMapping("/updateCategory/{id}")
    private Category updateProduct(@PathVariable Long id,@RequestBody Category category){
        return  iCategoryService.updateCategory(id,category);
    }

}
