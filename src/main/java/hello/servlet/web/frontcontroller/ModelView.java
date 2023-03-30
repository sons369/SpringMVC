package hello.servlet.web.frontcontroller;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
public class ModelView {
    @NonNull
    private String viewName;
    @NonNull
    private Map<String, Object> model = new HashMap<>();
}
