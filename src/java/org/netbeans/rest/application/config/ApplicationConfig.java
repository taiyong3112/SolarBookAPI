/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import service.PublisherService;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author TaiyoNg
 */
@javax.ws.rs.ApplicationPath("solar_book")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.BookService.class);
        resources.add(service.CartService.class);
        resources.add(service.CategoryService.class);
        resources.add(service.CityService.class);
        resources.add(service.NewsService.class);
        resources.add(service.OrderDetailService.class);
        resources.add(service.OrderService.class);
        resources.add(service.PaymentService.class);
        resources.add(service.PromoCodeService.class);
        resources.add(service.PublisherService.class);
        resources.add(service.UserService.class);
    }
    
}
