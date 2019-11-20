package com.cjx.spring.config;

import com.cjx.spring.enums.DatabaseTypeEnum;

public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<DatabaseTypeEnum> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseTypeEnum type){
        contextHolder.set(type);
    }

    public static DatabaseTypeEnum getDatabaseType(){
        return contextHolder.get();
    }

    public static void resetDatabaseType() {
        contextHolder.set(DatabaseTypeEnum.PRIMARY);
    }

}
