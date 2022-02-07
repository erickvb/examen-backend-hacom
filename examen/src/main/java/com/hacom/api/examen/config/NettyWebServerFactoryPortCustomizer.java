package com.hacom.api.examen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class NettyWebServerFactoryPortCustomizer 
  implements WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {
	@Autowired
	private ConfigProperties configProp;

    @Override
    public void customize(NettyReactiveWebServerFactory serverFactory) {
        serverFactory.setPort(Integer.parseInt(configProp.getApiPort()));
    }
}