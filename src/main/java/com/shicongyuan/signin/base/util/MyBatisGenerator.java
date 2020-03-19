package com.shicongyuan.signin.base.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * mybatis plus逆向工程
 */
public class MyBatisGenerator {
    public static void main(String[] args) {
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("F:\\signin\\src\\main\\java");
        gc.setFileOverride(true);//文件覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor("LXG");
        gc.setServiceName("I%sService");//去掉前缀I
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");//连接驱动
        dsc.setUsername("root");//用户名
        dsc.setPassword("123");//密码
//        urljdbc那一段
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");//连接

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[] { "T" });// 此处可以修改为您的表前缀   去掉t
        strategy.setInclude(new String[] {
            "t_book"
        });//设置所生成数据库中的表
        strategy.setNaming(NamingStrategy.underline_to_camel);//不用下划线转驼峰命名

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.shicongyuan.signin.test");
        pc.setMapper("mapper");
        pc.setEntity("model");
        pc.setXml("mapper.xml");
        pc.setService("service");
        pc.setController("controller");


        //整合配置
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(gc);
        mpg.setDataSource(dsc);
        mpg.setStrategy(strategy);
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
        System.out.println("生成完毕");
    }
}
