package com.kaolafm.payment;

import com.kaolafm.payment.dto.AlipayDto;
import com.kaolafm.payment.service.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author gongzf
 * @date 2016/5/27
 */
public class IAlipayServiceSaveMoney {

    private IAlipayService alipayService;
    private IOrderService orderService;
    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:application-service.xml","classpath*:rpc-provider.xml"});
        alipayService = context.getBean(IAlipayService.class);
        orderService = context.getBean(IOrderService.class);
    }
    @Test
    public void addMoney(){
        //TODO谨慎运行 如要加钱 请将prod文件的dubbo.registry.register = false
        String outTradeNo = "";
        AlipayDto dto = new AlipayDto();
        dto.setNotifyType("trade_status_sync");
        dto.setPaymentType("1");
        dto.setQuantity(1);
        dto.setSellerEmail("gaol@autoradio.cn");
        dto.setTradeStatus("TRADE_SUCCESS");
        dto.setBuyerEmail("13460289101");
        dto.setBuyerId("2088702547010381");
        dto.setDiscount(0);
        dto.setGmtCreate(new Date());
        dto.setGmtPayment(new Date());
        dto.setIsTotalFeeAdjust("N");
        dto.setNotifyId("12a06acfc6562409fa06dd69ec40e0dixm");
        dto.setNotifyTime(new Date());
        dto.setOutTradeNo(outTradeNo);
        dto.setTotalFee(10.00);
        dto.setPrice(10.00);
        dto.setSign("ftQhRWR0y1o4IxlEdAVLEjuX/k1W4NsbFB5W7g0qov4MkOAN4SnY\n" +
                "s2elcHp9xx+tp8aVOtZf7Rw6fRkxxNOgAeR9zdNdAdhmg9MuSm3/zvH1p/VyyDd+YuqSyG5auZIy4h7P2VkwXPT/Ktj3v2DwueLAATrwTh248x+jwaMUhOE=");
        dto.setSignType("RSA");
        dto.setSubject("拉虚拟商品");
        dto.setTradeNo("2016052621001004380223293730");
        Boolean flag = alipayService.doSaveAliResult(dto);
        if (flag) {
            orderService.doPresentLeaf(outTradeNo);
        }
    }
}
