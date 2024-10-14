class Person:

    def __init__(self, name, age, gender):
        self.name = name
        self.age = int(age)
        self.gender = self.validate_gender(gender)
    
    def validate_gender(self, gender):
        valid_gender = ['male', 'female']
        if gender not in valid_gender:
            raise ValueError(f'잘못된 성별을 입력하셨습니다. "male" 또는 "female"을 입력하세요.')
        return gender

    def display(self):
        print(f'이름: {self.name}, 성별: {self.gender}')
        print(f'나이: {self.age}')

    def greet(self):
        if self.age>19:
            print(f'안녕하세요, {self.name}! 성인이시군요!')
        else:
            print(f'안녕하세요, {self.name}! 미성년자시군요!')


while True:
    try:
        a, b, c = input('이름, 나이, 성별을 공백으로 구분해 입력해주세요: ').split()
        person = Person(a,b,c)
        break
    except ValueError as e:
        print(e)

person.display()
person.greet()