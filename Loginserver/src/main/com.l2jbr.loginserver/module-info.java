module com.l2jbr.loginserver {
    requires com.l2jbr.commons;
    requires com.l2jbr.mmocore;

    requires java.xml;
    requires java.sql;
    requires org.slf4j;
    requires spring.data.commons;

    exports com.l2jbr.loginserver;
}