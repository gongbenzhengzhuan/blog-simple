package com.zhiyiyo.controller;

import com.zhiyiyo.domain.ResponseResult;
import com.zhiyiyo.domain.dto.ArticleDTO;
import com.zhiyiyo.domain.dto.ArticleQueryDTO;
import com.zhiyiyo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticleList")
    public ResponseResult getHotArticleList() {
        return articleService.getHotArticleList();
    }

    @GetMapping("/articleList")
    public ResponseResult getArticleList(@Valid ArticleQueryDTO articleQueryDTO){
        return articleService.getArticleList(articleQueryDTO);
    }

//    http://localhost:9005/login
//    {"userName":"dzl","password":"333a0611c53368697659b4248d6cdd99"}
//    http://localhost:9005/article/auth

    @GetMapping("/auth")
    @PreAuthorize("hasAuthority('article:add')")
    public ResponseResult getAuth(){
        System.out.println("add");
        return ResponseResult.okResult();
    }

    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id) {
        return articleService.getArticleDetail(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('article:add')")
    public ResponseResult addArticle(@Valid @RequestBody ArticleDTO article){
        return articleService.addArticle(article);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('article:edit')")
    public ResponseResult editArticle(@Valid @RequestBody ArticleDTO article){
        return articleService.editArticle(article);
    }

    @GetMapping("/count")
    public ResponseResult getArticleCount(){
        return articleService.getArticleCount();
    }

    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable Long id){
        return articleService.updateViewCount(id);
    }

    @GetMapping("/previousNextArticle/{id}")
    public ResponseResult getPreviousNextArticle(@PathVariable Long id){
        return articleService.getPreviousNextArticle(id);
    }

}
