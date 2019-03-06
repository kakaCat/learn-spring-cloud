package learn.spring.beanextend.beanpostprocessor;

public class CommonBean {

    private String commonName;

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void initMethod() {
        System.out.println("Enter CommonBean.initMethod(), commonName = " + commonName);
    }

}
