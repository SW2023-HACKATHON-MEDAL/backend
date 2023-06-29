package medal.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String loginId;
    private String password;
    private String userName;
    private String phoneNumber;
    private String role; //manager or nonManager


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managedMember_id")
    private Member managedMember; // 관리할 계정

}
