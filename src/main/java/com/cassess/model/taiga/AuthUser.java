package com.cassess.model.taiga;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taiga_user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthUser {

    @Id
    @Column(name = "auth_token")
    private String auth_token;
    @Column(name = "big_photo")
    private String big_photo;
    @Column(name = "bio")
    private String bio;
    @Column(name = "color")
    private String color;
    @Column(name = "email")
    private String email;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "full_name_display")
    private String full_name_display;
    @Column(name = "gravatar_id")
    private String gravatar_id;
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "is_active")
    private boolean is_active;
    @Column(name = "lang")
    private String lang;
    @Column(name = "max_memberships_private_projects")
    private String max_memberships_private_projects;
    @Column(name = "max_memberships_public_projects")
    private String max_memberships_public_projects;
    @Column(name = "max_private_projects")
    private String max_private_projects;
    @Column(name = "max_public_projects")
    private String max_public_projects;
    @Column(name = "photo")
    private String photo;
    @Column(name = "projects_with_me")
    private String[] projects_with_me;
    @Column(name = "roles")
    private String[] roles;
    @Column(name = "theme")
    private String theme;
    @Column(name = "timezone")
    private String timezone;
    @Column(name = "total_private_projects")
    private String total_private_projects;
    @Column(name = "total_public_projects")
    private String total_public_projects;


    public AuthUser() {

    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getBig_photo() {
        return big_photo;
    }

    public void setBig_photo(String big_photo) {
        this.big_photo = big_photo;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name_display() {
        return full_name_display;
    }

    public void setFull_name_display(String full_name_display) {
        this.full_name_display = full_name_display;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getMax_memberships_private_projects() {
        return max_memberships_private_projects;
    }

    public void setMax_memberships_private_projects(String max_memberships_private_projects) {
        this.max_memberships_private_projects = max_memberships_private_projects;
    }

    public String getMax_memberships_public_projects() {
        return max_memberships_public_projects;
    }

    public void setMax_memberships_public_projects(String max_memberships_public_projects) {
        this.max_memberships_public_projects = max_memberships_public_projects;
    }

    public String getMax_private_projects() {
        return max_private_projects;
    }

    public void setMax_private_projects(String max_private_projects) {
        this.max_private_projects = max_private_projects;
    }

    public String getMax_public_projects() {
        return max_public_projects;
    }

    public void setMax_public_projects(String max_public_projects) {
        this.max_public_projects = max_public_projects;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String[] getProjects_with_me() {
        return projects_with_me;
    }

    public void setProjects_with_me(String[] projects_with_me) {
        this.projects_with_me = projects_with_me;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTotal_private_projects() {
        return total_private_projects;
    }

    public void setTotal_private_projects(String total_private_projects) {
        this.total_private_projects = total_private_projects;
    }

    public String getTotal_public_projects() {
        return total_public_projects;
    }

    public void setTotal_public_projects(String total_public_projects) {
        this.total_public_projects = total_public_projects;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
