package com.ggemo.callingCard.provider;

import com.ggemo.callingCard.provider.db.dao.CardsDAO;
import com.ggemo.callingCard.provider.db.dos.CardsDO;
import org.apache.dubbo.config.annotation.Service;
import com.ggemo.callingCard.DemoService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    CardsDAO cardsDAO;

    @Override
    public String sayHello(String name) {
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String hello2(){
        CardsDO cardsDO = new CardsDO();
        cardsDO.setId(10L);
        cardsDO.setUserId(10L);
        cardsDO.setAccess((byte)1);
        cardsDAO.insert(cardsDO);
        logger.info("啊啊啊");
        logger.info(Long.toString(cardsDO.getCreatedAt().getTime()));
        return "啊啊啊";
    }
}
