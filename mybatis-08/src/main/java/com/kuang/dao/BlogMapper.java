package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Willam_xh
 * @create 2021-04-29 14:38
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);


    //查询博客
    List<Blog> queryBlogIF(Map map);

    //
    List<Blog> queryBlogChoose(Map map);


    int updateBlog(Map map);


    //查询第1 2 3号记录的博客
    List<Blog> queryBlogForeach(Map map);





}
