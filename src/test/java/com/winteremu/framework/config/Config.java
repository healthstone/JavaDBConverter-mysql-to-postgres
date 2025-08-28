package com.winteremu.framework.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.winteremu.framework.config.database.DatabaseCfg;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {
    @JsonProperty("database_mysql_dbc")
    private DatabaseCfg database_mysql_dbc;
    @JsonProperty("database_mysql_world")
    private DatabaseCfg database_mysql_world;

    @JsonProperty("database_postgres")
    private DatabaseCfg database_postgres;
}
