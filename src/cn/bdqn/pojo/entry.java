package cn.bdqn.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: xucunxin
 * @date: 2018/11/20
 * @package org.news.pojo
 * @description: TODO
 */
public class entry {
    //�ĵ����
    private Integer id;
    //������
    private Integer categoryId;
    //�ĵ�����
    private String title;
    //ժҪ
    private String summary;
    //�ϴ���
    private String uplogaduser;
    //����ʱ��
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    //����
    private String name;
    //�޲ι���
    public entry(){}
    //�вι���
    public entry(Integer id, Integer categoryId, String title, String summary, String uploaduser, Date createdate) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.summary = summary;
        this.uplogaduser = uploaduser;
        this.createdate = createdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUplogaduser() {
        return uplogaduser;
    }

    public void setUplogaduser(String uplogaduser) {
        this.uplogaduser = uplogaduser;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
