package com.training.AngularSpring.model.response;

import lombok.*;

import java.util.List;
import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ErrorModel {
    @NonNull private Date timestamp;
    private List<String> errorDetails;
}