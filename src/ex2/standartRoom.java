package ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class standartRoom extends Room {
    private int m_small_vault_code;
    public void reetVaultCode()
    {
        this.m_small_vault_code =1111;
    }

}
