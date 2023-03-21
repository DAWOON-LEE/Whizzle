package com.bear.whizzle.diary.controller.dto;

import com.bear.whizzle.domain.model.type.DrinkLevel;
import com.bear.whizzle.domain.model.type.Emotion;
import java.time.LocalDate;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class DiaryRequestUpdateDto implements DiaryRequestDto {

    @NotNull
    private Emotion emotion;

    @NotNull
    private DrinkLevel drinkLevel;

    @NotNull
    private String content;

    @EqualsAndHashCode.Exclude
    private List<Integer> deletedDrinkOrders;

    @EqualsAndHashCode.Exclude
    private List<Long> insertedWhiskyIds;

    @Override
    public LocalDate getDate() {
        return null;
    }

}
