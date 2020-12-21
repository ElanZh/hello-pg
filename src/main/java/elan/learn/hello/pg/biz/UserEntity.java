package elan.learn.hello.pg.biz;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLHStoreType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@TypeDefs({
//        @TypeDef(name = "json", typeClass = JsonBinaryType.class),
//        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class),
        @TypeDef(name = "hstore", typeClass = PostgreSQLHStoreType.class)
})
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Builder
@Table(name = "t_user")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "sq_user")
    private Integer id;

    @Column(length = 100)
    private String name;


    @Type(type = "hstore")
    @Column(columnDefinition = "hstore")
    private Map<String, String> book;

}
