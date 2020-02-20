import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public abstract class PatternBase implements Serializable{
    private String user1;
    private String pwd1;

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getPwd1() {
        return pwd1;
    }

    public void setPwd1(String pwd1) {
        this.pwd1 = pwd1;
    }

    public String toString() {
        /*return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("user1", user1)
                .append("pwd1", pwd1).toString();*/
        return ToStringBuilder.reflectionToString(this);
    }
}
