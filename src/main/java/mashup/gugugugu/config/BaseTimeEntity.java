package mashup.gugugugu.config;

import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;

public abstract class BaseTimeEntity extends CreateTimeEntity{
    @LastModifiedDate
    private LocalDateTime deletedDate;
}
