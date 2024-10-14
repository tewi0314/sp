import random

def game():
    ri = random.randint(1,10)
    print('1과 10사이의 숫자를 하나 정했습니다')
    print('이 숫자는 무엇일까요?')
    bo = True
    while bo:
        user_input = int(input('예상 숫자: '))
        if user_input > ri:
            print('너무 큽니다. 다시 입력하세요.')
        elif user_input < ri:
            print('너무 작습니다. 다시 입력하세요')
        else:
            print('정답입니다!')
            while True:
                user_input2 = input('게임을 다시 하시겠습니까? (y/n): ')
                if user_input2 == 'y':
                    game()
                    bo = False
                    break
                elif user_input2 == 'n':
                    print('게임을 종료합니다. 즐거우셨나요? 또 만나요!')
                    bo = False
                    break
                else:
                    print('잘못된 입력입니다.')

game()