package medal.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import medal.backend.entity.Pill;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PillDto {
    private Long pillId;
    private String name; // 이름
    private String color; // 색깔
    private String shape; // 모양
    private String texture; // 제형
    private String storeImgName; //사진 (로컬에 저장된 이름)


    public PillDto(Pill pill) {
        this.pillId = pill.getId();
        this.name = pill.getName();
        this.color = pill.getColor();
        this.shape = pill.getShape();
        this.texture = pill.getTexture();
        this.storeImgName = pill.getStoreImgName();
    }
}