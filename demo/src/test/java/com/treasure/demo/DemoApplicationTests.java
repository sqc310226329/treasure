//package com.treasure.demo;
//
//import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.treasure.demo.mapper.UserMapper;
//import com.treasure.demo.model.GradeEnum;
//import com.treasure.demo.model.User;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.treasure.tool.entity.CreateExcel;
//import com.treasure.tool.entity.ExcelTemplateParams;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootTest
//class DemoApplicationTests {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void contextLoads() {
//        ExcelTemplateParams templateParams = new ExcelTemplateParams();
//        templateParams.setFileName("D:/test01.xlsx");
//        templateParams.setFirstRow(1);
//        templateParams.setLastRow(20);
//        templateParams.setFlag(true);
//        templateParams.setRowIndex(0);
//        templateParams.setSheetName("test");
//        templateParams.setParamsList(Arrays.asList(new ExcelTemplateParams.MenuParams("a",3),
//                new ExcelTemplateParams.MenuParams("d",2)));
//        String path = getClass().getClassLoader().getResource("test.json").toString();
//        System.out.println(path);
//        path = path.replace("\\", "/");
//        if (path.contains(":")) {
//            path = path.replace("file:/", "");// 2
//        }
//        templateParams.setReadFilepath(path);
//        new CreateExcel().createExcelTemplate2007(templateParams);
//
//    }
//
//    @Test
//    public void testSelect() {
//      /*  List<User> userList = userMapper.selectList(null);
////        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);*/
//        List<User> user = userMapper.selectList(new QueryWrapper<User>()
//                .lambda().eq(User::getGradle, GradeEnum.HIGH));
//        user.forEach(a->{
//            System.out.println(a.getGradle());
//        });
//    }
//
//    @Test
//    public void lambdaPagination() {
//        Page<User> page = new Page<>(1, 3);
//        Page<User> result = userMapper.selectPage(page, Wrappers.<User>lambdaQuery().ge(User::getAge, 1).orderByAsc(User::getAge));
//
//        System.out.println(result);
//    }
//
//}
