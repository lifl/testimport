package com.kaolafm.payment.constants;

/**
 * @author gongzf
 * @date 2016/3/15
 */
public class AlipayConstant {

    //支付宝公钥
    public static final String PUBLIC_KEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

    //应用私钥
    public static final  String PRIVATE_KEY="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAONnEnD3GKfbQMmqwtsD2vnRcJmdGaYbRwL9BqhKvgsSRkg+k55OVVz8vhP2X/CTkEGMW2LZg4SPExAIlEauPwNJR8vXE+NGUjROsomiY4glxWvj/aVbg0LQgU2/j59xQ+1VGXkUUr933QJaXDehTd2T9Tadp2lipxMB6oai0k3PAgMBAAECgYBEHcjRW8Lf7PYwMl1h23rJYCo5aWyYbA1OYNqQqKraiCPTWiM/xTkevHp3YlKErr8EU3XAW2Vg3LaaE+fOcD1hPw2cY2Rdm6K4Yquhc/9P8mgskuWlThb4HUGRF22a/OEacL0Fe8F2lFCThEkyFXxLv0uc0bMS5u5HJZmDCKXnkQJBAPVxxvJrA1gOJ/eqA6pWyXlJcBx3bPfGF+P11tDjSjKtFeA4I6PnNWVxl4/fOPmnZJ3ETjzJ2oRJuLp0LnR9UrcCQQDtLqnRT4VCaZrXsQ7zxojzPbOtT1EUM2Qd/GDre3A4G1skgUYX4AbSO1Nb2waTHpLJkxAVOzvg0F6mO5aar+WpAkAkbcmoa0eoxxkZgitfGdh3XvX706HhuI4NMIy8ni+CC/yGNe7cQdHEB7MGEIyFSVn+rIcsMI11Ovfm/J10frFLAkA6otCkyG3/bzAyprk1lx2AVP64l+VJgzL7HsuvK8Mge9LagYMcn+vPyY7gJJPJh0Nuxgax2QUCnUDpA85Fy7qRAkEAtzHBzGf7k/3vcrnyvBI2oLeTSVfvHBLgBt54sWWDlD/s3IQjxyybf5DK4jBeA3jN6dGtmRk3B2jbR5zxDoz4kw==";

    //接口名称
    public static final  String SERVICE="\"mobile.securitypay.pay\"";

    //合作者身份ID
    public static final  String PARTERNER="\"2088021786280266\"";
    //参数编码字符集
    public static final  String _INPUT_CHARSET="\"utf-8\"";
    //签名方式
    public static final  String SIGN_TYPE="\"RSA\"";
    //服务器异步通知url
    public static final  String NOTIFY_URL="\"http://repay.kaolafm.com/pay/alipay/notify\"";
    //商品名称
    public static final  String SUBJECT="\"考拉虚拟商品\"";
    //支付类型 默认为1 商品购买
    public static final  String PAYMENT_TYPE="\"1\"";
    //卖家支付宝账号
    public static final  String SELLER_ID="\"gaol@autoradio.cn\"";

    //商品详情
    public static final  String BODY="\"考拉虚拟商品\"";
    //是否发起实名校验 T 校验  F 不校验
    public static final  String RN_CHECK="T";

    public static final  String IT_B_PAY="\"30m\"";

    //支付成功状态
    public static final String TRADE_STATUS_SUCCESS="TRADE_SUCCESS";
    //支付完成状态
    public static final String TRADE_STATUS_FINISHED="TRADE_FINISHED";
    //指定时间段内未支付关闭的交易
    public static final String TRADE_STATUS_CLOSED = "TRADE_CLOSED";


    public static final  String input_charset="utf-8";

    //批量转账接口名称
    public static final String withdraw_service = "batch_trans_notify";

    public static final  String partener ="2088021786280266";

    //批量转账通知URL
    public static final  String withdraw_notify_url ="http://repay.kaolafm.com/pay/alipay/withdraw/notify";

    //付款方的账户名
    public static final  String seller_account="网乐互联（北京）科技有限公司";

    //卖家支付宝账号
    public static final  String seller_id="gaol@autoradio.cn";

    //签名方式
    public static final  String sign_type="RSA";




}
