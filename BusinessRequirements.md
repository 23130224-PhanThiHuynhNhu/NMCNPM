Business Requirements Document (BRD) - Game Cờ Chém
1. Giới thiệu

Game Cờ Chém là trò chơi chiến thuật nơi người chơi điều khiển các quân cờ và sử dụng kỹ năng để chiến đấu với đối phương. Trò chơi này yêu cầu người chơi có chiến thuật hợp lý và khả năng dự đoán các động thái của đối thủ.

2. Mục tiêu của dự án
Cung cấp một trò chơi chiến thuật hấp dẫn và thử thách người chơi.
Đảm bảo tính công bằng và rõ ràng trong các bước di chuyển và ăn quân.
Tạo ra một trải nghiệm chơi game mượt mà, dễ dàng quản lý và kiểm soát.
3. Các tính năng chính
3.1. Luật chơi
Lượt chơi
Điều kiện lượt đi: Hai người chơi luân phiên thực hiện lượt đi.
Mỗi lượt:
Người chơi chỉ được di chuyển 1 quân cờ trong mỗi lượt đi.
Mỗi quân cờ chỉ có thể di chuyển theo quy tắc riêng của nó.
Chỉ quân cờ hợp lệ mới được di chuyển trong mỗi lượt đi.
Bắt quân
Khi quân cờ đối phương đứng ở vị trí có thể bị ăn, người chơi có thể "bắt" quân cờ đối phương.
Ăn đơn: Quân cờ đối phương bị tiêu diệt ngay lập tức khi đứng trên một ô có thể ăn được.
Ăn liên hoàn: Sau khi ăn đơn, nếu quân cờ có thể tiếp tục ăn thêm quân cờ khác, người chơi có thể thực hiện thêm lượt ăn liên hoàn.
Kết thúc game
Trò chơi kết thúc khi một người chơi thắng hoặc thua theo các điều kiện:
Điều kiện thắng: Người chơi ăn hết quân đối phương hoặc đối phương không còn nước đi hợp lệ.
Điều kiện thua: Người chơi không còn quân cờ trên bàn cờ hoặc không thể thực hiện nước đi hợp lệ nào.
4. Các yêu cầu chức năng
4.1. Quản lý trò chơi
Khởi tạo bàn cờ:
Hệ thống sẽ khởi tạo bàn cờ với số lượng quân cờ, vị trí quân cờ ban đầu.
Bàn cờ sẽ được chia thành các ô vuông có thể chứa quân cờ.
Thiết lập vị trí ban đầu:
Quân cờ của hai người chơi sẽ được đặt ở các ô cố định trong một lần khởi tạo trò chơi.
Vị trí khởi đầu của các quân cờ sẽ được quy định trong luật chơi, đảm bảo tính công bằng.
Quản lý lượt chơi:
Mỗi lượt đi chỉ cho phép một người chơi thực hiện hành động.
Sau khi người chơi thực hiện xong lượt đi của mình, lượt chơi sẽ chuyển sang đối phương.
Hệ thống cần đảm bảo tính chính xác của lượt chơi, không để một người chơi có thể di chuyển quá lượt.
4.2. Di chuyển
Kiểm tra nước đi hợp lệ:
Hệ thống sẽ kiểm tra xem nước đi của người chơi có hợp lệ không (quân cờ không đi ra ngoài bàn cờ, không di chuyển qua các ô cấm, v.v.).
Các nước đi không hợp lệ sẽ bị từ chối và yêu cầu người chơi thực hiện lại.
Thực hiện di chuyển quân:
Sau khi nước đi hợp lệ được xác nhận, hệ thống sẽ di chuyển quân cờ đến vị trí mới trên bàn cờ.
4.3. Bắt quân
Xác định khả năng ăn:
Hệ thống sẽ xác định xem có thể bắt quân cờ đối phương hay không.
Quân cờ chỉ có thể bị bắt khi nó đứng ở một vị trí hợp lệ và quân đối phương có thể ăn được quân này.
Thực hiện ăn đơn và ăn liên hoàn:
Ăn đơn: Sau khi xác định được quân đối phương có thể bị ăn, hệ thống sẽ thực hiện hành động bắt quân và loại bỏ quân cờ đó khỏi bàn cờ.
Ăn liên hoàn: Hệ thống sẽ tiếp tục kiểm tra và cho phép quân cờ tiếp tục ăn thêm quân cờ đối phương nếu đủ điều kiện.
4.4. Kết thúc game
Kiểm tra điều kiện thắng/thua:
Trò chơi sẽ kiểm tra sau mỗi lượt đi nếu một trong hai người chơi đạt được điều kiện thắng hoặc thua:
Điều kiện thắng: Ăn hết quân cờ của đối phương hoặc đối phương không còn nước đi hợp lệ.
Điều kiện thua: Người chơi không còn quân cờ trên bàn cờ hoặc không thể thực hiện bất kỳ nước đi hợp lệ nào.
Hiển thị kết quả:
Sau khi trò chơi kết thúc, hệ thống sẽ hiển thị kết quả trận đấu (Thắng/Hòa/Thua) cho người chơi.
Kết quả này có thể bao gồm các thống kê, ví dụ như số quân cờ ăn được, số lượt đi, v.v.
5. Yêu cầu về người dùng
Tạo tài khoản và đăng nhập:
Người chơi cần đăng nhập vào hệ thống qua tài khoản để tham gia trò chơi.
Chế độ chơi đơn và chơi trực tuyến:
Cung cấp chế độ chơi đơn với AI hoặc chế độ chơi trực tuyến với người chơi khác.
Quản lý trận đấu:
Người chơi có thể tham gia và quản lý các trận đấu của mình từ menu chính của game.
6. Yêu cầu về hệ thống
Server: Cần có máy chủ hỗ trợ nhiều người chơi trực tuyến cùng lúc mà không gây độ trễ.
Database: Lưu trữ thông tin tài khoản, lịch sử trận đấu, tiến trình game và các kết quả.
7. Kết luận

Game Cờ Chém là một trò chơi chiến thuật mang tính đối kháng cao, kết hợp với yếu tố hành động khi bắt quân. Cung cấp cho người chơi một trải nghiệm chiến đấu đa dạng, thử thách và hấp dẫn, đồng thời dễ dàng quản lý và kiểm soát lượt chơi, di chuyển quân và bắt quân.
