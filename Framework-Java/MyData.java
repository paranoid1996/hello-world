import java.util.Objects;

/**
 * 通用数据表
 *
 * @author blocface
 */
public class MyData {
    private Integer id;
    private String field1;
    private Boolean field2;
    private Double field3;

    public MyData() {
    }

    public MyData(Integer id, String field1, Boolean field2, Double field3) {
        this.id = id;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Boolean getField2() {
        return field2;
    }

    public void setField2(Boolean field2) {
        this.field2 = field2;
    }

    public Double getField3() {
        return field3;
    }

    public void setField3(Double field3) {
        this.field3 = field3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return Objects.equals(id, myData.id) &&
                Objects.equals(field1, myData.field1) &&
                Objects.equals(field2, myData.field2) &&
                Objects.equals(field3, myData.field3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field1, field2, field3);
    }
}
