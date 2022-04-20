package dto.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order{
	private int petId;
	private int quantity;
	private int id;
	private String shipDate;
	private boolean complete;
	private String status;
}